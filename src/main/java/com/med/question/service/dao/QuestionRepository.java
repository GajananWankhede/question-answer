package com.med.question.service.dao;

import com.med.question.service.entity.Question;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface QuestionRepository extends CrudRepository<Question,Integer>{


//    @Query(value = "SELECT * FROM Question q where q.question_id = :questionId",nativeQuery = true)
//    public Question getById(@Param("questionId") Integer questionId);

//	@Query(value = "SELECT    * FROM Parking p where p.owner_id = :ownerId",nativeQuery = true)
//    public Optional<Parking> getParkingByOwnerId(@Param("ownerId") String ownerId);
//
//	@Query(value = "SELECT * FROM Parking p where p.PARKING_STATUS = :parkingStatus",nativeQuery = true)
//    public Optional<Parking> getOccupiedParkingSlots(@Param("parkingStatus") String parkingStatus);
    }
