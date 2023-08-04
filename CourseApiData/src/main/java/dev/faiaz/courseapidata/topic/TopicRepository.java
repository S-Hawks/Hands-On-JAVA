package dev.faiaz.courseapidata.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {
    //We have some standard crud operation, that's all are the
    //same->
    //getAllTopic()
    //getTopic(String id)
    //updateTopic(Topic t)
    //deleteTopic(String id)
}
