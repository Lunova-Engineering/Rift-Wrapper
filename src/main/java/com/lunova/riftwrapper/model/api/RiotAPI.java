package com.lunova.riftwrapper.model.api;

import com.lunova.riftwrapper.RiftWrapper;
import com.lunova.riftwrapper.model.api.strategy.dto.CollectionDataStrategy;
import com.lunova.riftwrapper.model.api.strategy.dto.SingleDataStrategy;
import com.lunova.riftwrapper.model.api.strategy.endpoint.EndpointStrategy;
import com.lunova.riftwrapper.model.dto.DataTransferObject;
import com.lunova.riftwrapper.model.user.UserObject;
import com.lunova.riftwrapper.network.HttpRequest;
import com.lunova.riftwrapper.utilities.JsonUtility;

import java.util.Collection;

public abstract class RiotAPI {

    protected abstract String getBaseUrl();
    protected abstract EndpointBuilder getEndpointBuilder();

    public <DTO extends DataTransferObject, USER extends UserObject> USER fetchSingleData(
            EndpointStrategy endpointStrategy, SingleDataStrategy<DTO, USER> dataStrategy) {
        String endpoint = endpointStrategy.buildEndpoint(getEndpointBuilder());
        String response = HttpRequest.sendRequest(endpoint, RiftWrapper.RIOT_API_KEY);
        DTO dto = JsonUtility.deserialize(response, dataStrategy.getDTOClass());
        return dto != null ? dataStrategy.transform(dto) : dataStrategy.getDefaultInstance();
    }

    public <DTO extends DataTransferObject, USER extends UserObject> Collection<USER> fetchCollectionData(
            EndpointStrategy endpointStrategy, CollectionDataStrategy<DTO, USER> dataStrategy) {
        String endpoint = endpointStrategy.buildEndpoint(getEndpointBuilder());
        String response = HttpRequest.sendRequest(endpoint, RiftWrapper.RIOT_API_KEY);
        Collection<DTO> dtoCollection = JsonUtility.deserialize(response, dataStrategy.getDTOCollectionType());
        return dtoCollection != null ? dataStrategy.transform(dtoCollection) : dataStrategy.getDefaultCollectionInstance();
    }
}
