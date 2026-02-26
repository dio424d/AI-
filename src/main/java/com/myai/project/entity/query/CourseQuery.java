package com.myai.project.entity.query;

import lombok.Data;
import org.springframework.ai.tool.annotation.ToolParam;

import java.util.List;

@Data
public class CourseQuery {
    @ToolParam(required = false, description = "课程类型：编程、设计、自媒体、其他")
    private String type;
    @ToolParam(required = false, description = "学历要求：-1-无要求�?-0-初中�?-1-高中�?-2-大专�?-3-本科及本科以上")
    private Integer edu;
    @ToolParam(required = false, description = "排序方式")
    private List<Sort> sorts;

    @Data
    public static class Sort {
        @ToolParam(required = false, description = "排序字段: price或duration")
        private String field;
        @ToolParam(required = false, description = "是否是升序排序�? true/false")
        private Boolean asc;
    }
}
