package com.ld.cloud;

import com.ld.cloud.dto.CommonResult;
import com.ld.cloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 28415@hand-china.com 2020/08/16 11:58
 */
@RestController
@RequestMapping("/consumer")
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL="http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/payment")
    public CommonResult<Payment> create(@RequestBody @Valid Payment payment, BindingResult result){
        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            String errorsString = allErrors.stream()
                    .map(e-> e.getCode()+e.getDefaultMessage())
                    .collect(Collectors.joining());
            return new CommonResult<>(405,errorsString);
        }
        log.info("调用接口创建订单。。。。。。");
        return restTemplate.postForObject(PAYMENT_URL + "/payment", payment, CommonResult.class);
    }

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> getPayment(@PathVariable  Long id){

        log.info("调用接口获取订单信息。。。。。。");
        return restTemplate.getForObject(PAYMENT_URL+"/payment/"+id,CommonResult.class);
    }


}
