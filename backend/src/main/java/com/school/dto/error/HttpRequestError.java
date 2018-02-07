package com.school.dto.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HttpRequestError {
  String status;
  String title;
  String detail;

  @JsonProperty("source")
  SourceErrorDTO source;
}
