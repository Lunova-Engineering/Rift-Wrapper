package com.lunova.riftwrapper.utilities;

import com.google.common.collect.ImmutableMap;
import com.lunova.riftwrapper.model.api.RiotAPI;
import com.lunova.riftwrapper.model.api.impl.LeagueAPI;
import com.lunova.riftwrapper.model.api.impl.SummonerAPI;
import com.lunova.riftwrapper.model.api.strategy.SingleDataStrategy;
import com.lunova.riftwrapper.model.api.strategy.dto.LeagueEntryStrategy;
import com.lunova.riftwrapper.model.api.strategy.dto.LeagueListStrategy;
import com.lunova.riftwrapper.model.api.strategy.dto.SummonerStrategy;
import com.lunova.riftwrapper.model.api.strategy.endpoint.BaseEndpointStrategy;
import com.lunova.riftwrapper.model.api.strategy.EndpointStrategy;

public class RiftWrapperCache {

    private static final ImmutableMap<Class<? extends EndpointStrategy>, EndpointStrategy> ENDPOINT_STRATEGIES;
    private static final ImmutableMap<Class<? extends SingleDataStrategy<?, ?>>, SingleDataStrategy<?, ?>> DATA_STRATEGIES;
    private static final ImmutableMap<Class<? extends RiotAPI>, RiotAPI> API_CACHE;

    static {
        ImmutableMap.Builder<Class<? extends EndpointStrategy>, EndpointStrategy> endpointBuilder = ImmutableMap.builder();
        endpointBuilder.put(BaseEndpointStrategy.class, new BaseEndpointStrategy(""));

        ENDPOINT_STRATEGIES = endpointBuilder.build();

        ImmutableMap.Builder<Class<? extends SingleDataStrategy<?, ?>>, SingleDataStrategy<?, ?>> dataBuilder = ImmutableMap.builder();
        dataBuilder.put(SummonerStrategy.class, new SummonerStrategy());
        dataBuilder.put(LeagueEntryStrategy.class, new LeagueEntryStrategy());
        dataBuilder.put(LeagueListStrategy.class, new LeagueListStrategy());

        DATA_STRATEGIES = dataBuilder.build();

        ImmutableMap.Builder<Class<? extends RiotAPI>, RiotAPI> apiBuilder = ImmutableMap.builder();
        apiBuilder.put(SummonerAPI.class, new SummonerAPI());
        apiBuilder.put(LeagueAPI.class, new LeagueAPI());

        API_CACHE = apiBuilder.build();
    }

    public static <T extends EndpointStrategy> T getEndpointStrategy(Class<T> clazz) {
        return clazz.cast(ENDPOINT_STRATEGIES.get(clazz));
    }

    public static <T extends SingleDataStrategy<?, ?>> T getDataStrategy(Class<T> clazz) {
        return clazz.cast(DATA_STRATEGIES.get(clazz));
    }

    public static <T extends RiotAPI> T getAPI(Class<T> clazz) {
        return clazz.cast(API_CACHE.get(clazz));
    }
}
