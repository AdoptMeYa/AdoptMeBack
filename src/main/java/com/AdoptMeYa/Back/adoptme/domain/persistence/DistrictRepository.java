package com.AdoptMeYa.Back.adoptme.domain.persistence;

import com.AdoptMeYa.Back.adoptme.domain.model.entity.District;
import com.AdoptMeYa.Back.adoptme.domain.model.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District,Long> {
    @Query(value =
            " SELECT pe FROM District pe WHERE pe.district = :district")
    List<District> ReadDistrictsByDistrict(@Param("district")String district);

}
