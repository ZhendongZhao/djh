package com.springboot.zzd.djh.controller;

import com.springboot.zzd.djh.User;
import com.springboot.zzd.djh.entity.Customer;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zhendong.Z
 * @date: 2019-11-20 16:13
 */
@RestController
@RequestMapping(value = "/users")
public class MyRestController {

    @ApiOperation(value = "获取用户信息")
    @RequestMapping(value = "/{user}", method = RequestMethod.GET)
    public ResponseEntity<User> getUser(@PathVariable Long user) {
        return null;
    }

    @RequestMapping(value = "/{user}/customers", method = RequestMethod.GET)
    ResponseEntity<List<Customer>> getUserCustomers(@PathVariable Long user) {
        return null;
    }

    @RequestMapping(value = "/{user}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUser(@PathVariable Long user) {
        return null;
    }
}
