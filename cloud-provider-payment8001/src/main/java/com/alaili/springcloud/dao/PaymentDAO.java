package com.alaili.springcloud.dao;

import com.alaili.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface PaymentDAO {

     int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}
