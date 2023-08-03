package dev.faiaz.courseapidata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    private final TopicRepository topicRepository;

    @Autowired
    public TopicService(TopicRepository topicRepository){
        this.topicRepository = topicRepository;
    }
//    TODO: do this for without database practice
//    private final List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("spring", "Spring Frame Work", "Spring Framework Description"),
//            new Topic("java", "Core Java", "Java Description"),
//            new Topic("javascript", "Javascript", "javascript Description")
//    ));

    public List<Topic> getTopics() {
//        TODO: Another grate way to use lambda and method reference.
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id) {
//        TODO: When it possible use lambda function
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id);

    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
//        TODO: With out repository we need to update in this way
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
//        TODO: without repository we need to delete in this way 
//        Optional<Topic> topicToDelete = topics.stream()
//                .filter(t -> t.getId().equals(id)).findFirst();
//        if (topicToDelete.isPresent()) {
//            Topic topic = topicToDelete.get();
//            topics.remove(topic);
//            return topic;
//        }
//        return null;
        topicRepository.deleteById(id);
    }
}


