package com.ld.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author 28415@hand-china.com 2020/08/16 11:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;

    @NotBlank(message = ": serial should not be null")
    @Length(min = 2,max = 100,message = "描述长度应该在2-100")
    private String serial;
}
