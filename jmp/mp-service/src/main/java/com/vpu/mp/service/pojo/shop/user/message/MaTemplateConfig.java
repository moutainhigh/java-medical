package com.vpu.mp.service.pojo.shop.user.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class MaTemplateConfig {
    private String id;
    private String title;
    private String content;
    private Integer[] keywordIds;
    private Integer emphasisKeywordSn;
    private String[] colors;
}
