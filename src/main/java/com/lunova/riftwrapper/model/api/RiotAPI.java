package com.lunova.riftwrapper.model.api;

import com.lunova.riftwrapper.RiftWrapper;
import com.lunova.riftwrapper.model.api.strategy.DataStrategy;
import com.lunova.riftwrapper.model.api.strategy.EndpointStrategy;
import com.lunova.riftwrapper.model.dto.DataTransferObject;
import com.lunova.riftwrapper.model.user.UserObject;
import com.lunova.riftwrapper.network.HttpRequest;

public abstract class RiotAPI {

    protected abstract String getBaseUrl();
    protected abstract EndpointBuilder getEndpointBuilder();

    public <DTO extends DataTransferObject, USER extends UserObject> USER fetchData(
            EndpointStrategy endpointStrategy, DataStrategy<DTO, USER> dataStrategy) {
        String endpoint = endpointStrategy.buildEndpoint(getEndpointBuilder());
        String response = HttpRequest.sendRequest(endpoint, RiftWrapper.RIOT_API_KEY);
        DTO dto = DataTransferObject.fromJson(response, null, dataStrategy.getDeserializeType());
        return dto != null ? dataStrategy.transform(dto) : dataStrategy.getDefaultUserInstance();
    }
}
