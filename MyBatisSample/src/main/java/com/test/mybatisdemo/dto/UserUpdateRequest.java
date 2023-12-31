package com.test.mybatisdemo.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
//import lombok.EqualsAndHashCode;
/**
 * ユーザー情報更新リクエストデータ
 *
 */
@Data
public class UserUpdateRequest implements Serializable {
    
//    private static final long serialVersionUID = 1L;
    private Long id;
	
	private static final long serialVersionUID = 1L;
	/**
     * 名前
     */
    @NotEmpty(message = "名前を入力してください")
    @Size(max = 100, message = "名前は100桁以内で入力してください")
    private String name;
    /**
     * 住所
     */
    @Size(max = 255, message = "住所は255桁以内で入力してください")
    private String address;
    /**
     * 電話番号
     */
    @Pattern(regexp = "0\\d{1,4}-\\d{1,4}-\\d{4}", message = "電話番号の形式で入力してください")
    private String phone;
}