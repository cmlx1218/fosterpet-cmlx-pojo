package com.fosterpet.cmlx.dto;

import com.fosterpet.cmlx.datasource.jpa.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author cmlx
 * @Date 2019-7-17 0017 9:53
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommunityDto extends BaseEntity {

    private Integer cid;
    private String img;
    private String title;
    private String content;
    private String username;
    private Integer category;

}
