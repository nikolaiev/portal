package com.school;

import com.school.entities.Event;
import com.school.repositories.EventRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJPAIntegrationTest {

    @Autowired
    private EventRepository eventRepository;

    @Test
    public void givenGenericEntityRepository_whenSaveAndRetreiveEntity_thenOK() {
        Event genericEntity = eventRepository
                .save(new Event(123,"test","test"));
        Event foundEntity = eventRepository
                .findOne(genericEntity.getId());

        assertNotNull(foundEntity);
        assertEquals(genericEntity.getTitle(), foundEntity.getTitle());
    }
}
