package com.AdoptMeYa.Back.adoptme.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("adoptmeMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public PublicationMapper publicationMapper() {
        return new PublicationMapper();
    }
    @Bean
    public AdvertisementMapper advertisementMapper(){return new AdvertisementMapper();}
    @Bean
    public PetMapper petMapper(){return new PetMapper();}
    @Bean
    public DistrictMapper districtMapper(){return new DistrictMapper();}
}
