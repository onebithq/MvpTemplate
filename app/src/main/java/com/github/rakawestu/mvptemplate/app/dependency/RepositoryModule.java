package com.github.rakawestu.mvptemplate.app.dependency;

import com.github.rakawestu.mvptemplate.domain.repository.Repository;
import com.github.rakawestu.mvptemplate.domain.repository.api.mapper.Mapper;
import com.github.rakawestu.mvptemplate.domain.repository.api.mapper.MapperImpl;
import com.github.rakawestu.mvptemplate.domain.repository.mock.MockRepository;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author glomadrian
 */
@Module(
        complete = false,
        library = true
)
public class RepositoryModule {

    @Provides
    public Mapper provideResponseMapper() {
        return new MapperImpl();
    }

    @Provides
    @Named("mock_api")
    public Repository provideMockRepository() {
        return new MockRepository();
    }
}
