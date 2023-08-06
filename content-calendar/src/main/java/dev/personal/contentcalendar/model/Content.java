package dev.personal.contentcalendar.model;

import java.time.LocalDateTime;
public record Content(Integer id,
                      String title,
                      Status status,
                      Type contentType,
                      LocalDateTime dateCreated,
                      LocalDateTime dateUpdated,
                      String url) {
}
