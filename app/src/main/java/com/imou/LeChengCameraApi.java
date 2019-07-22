package com.imou;

import com.imou.json.*;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.http.*;

public interface LeChengCameraApi {

    @POST("accessToken")
    Flowable<AccessTokenResponse> accessToken(@Body UserBindSms body);

    @POST("userToken")
    Observable<UserTokenResponse> getUserToken(@Body UserBindSms body);

    @POST("userBindSms") // 发送验证码
    Flowable<LeChengResponse> sendMessageCode(@Body UserBindSms body);

    @POST("userBind")
    Observable<LeChengResponse> userBind(@Body UserBind body);

    @POST("deviceOnline")
    Flowable<DeviceOnlineResponsse> deviceOnline(@Body DeviceOnline body);

    @POST("deviceList")
    Flowable<DeviceListResponse> deviceList(@Body DevicesListRequest body);

    @POST("shareDeviceList")
    Flowable<DeviceListResponse> shareDeviceList(@Body DevicesListRequest body);

    @POST("controlPTZ")
    Flowable<LeChengResponse<String>> controlPTZ(@Body ControlPTZRequest body);
}
