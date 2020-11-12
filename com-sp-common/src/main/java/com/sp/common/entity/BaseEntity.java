package com.sp.common.entity;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

/**
 * @author v_jxjxcheng
 * @date 2020-11-12 11:07
 */
@Getter
@Setter
public class BaseEntity {
    /**
     * 主键自增长ID
     */
    private Long id;
    /**
     * 乐观锁版本号
     */
    private Long version = 1L;
    /**
     * 创建人
     */
    private Long createdBy;
    private String createdByName;
    private LocalDateTime createdDate = LocalDateTime.now();
    /**
     * 最后更新人信息
     */
    private Long updatedBy;
    private String updatedByName;
    private LocalDateTime updatedDate = LocalDateTime.now();
}
