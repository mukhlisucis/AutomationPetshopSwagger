package starter.swagger;

import starter.swagger.Utils.Constant;

import java.security.CodeSigner;

public class SwaggerAPI {
    //Pet
    public static String POST_IMAGE_PET = Constant.BASE_URL+"/pet/{petId}/uploadImage" ;
    public static String POST_NEW_PET = Constant.BASE_URL +"/pet" ;
    public static String PUT_UPDATE_PET = Constant.BASE_URL+"/pet";
    public static String GET_PET_STATUS = Constant.BASE_URL+"/pet/findByStatus";
    public static String GET_PET_ID = Constant.BASE_URL+"/pet/{petId}";
    public static String POST_UPDATE_PET = Constant.BASE_URL+"/pet/{petId}" ;
    public static String DELETE_PET_ID = Constant.BASE_URL+"/pet/{petId}" ;

    //Store
    public static String POST_STORE_ORDER = Constant.BASE_URL+"/store/order" ;
    public static String GET_ORDER_ID = Constant.BASE_URL+"/store/order/{orderId}";
    public static String DELETE_ORDER_ID = Constant.BASE_URL+"/store/order/{orderId}" ;
    public static String GET_STORE_INVENTORY = Constant.BASE_URL+"/store/inventory" ;

    //User
    public static String POST_USER_ARRAY = Constant.BASE_URL+"/user/createWithArray" ;
    public static String POST_USER_LIST = Constant.BASE_URL+"/user/createWithList";
    public static String GET_USER_USERNAME = Constant.BASE_URL+"/user/{username}" ;
    public static String PUT_UPDATE_USER = Constant.BASE_URL+"/user/{username}";
    public static String DELETE_USER = Constant.BASE_URL+"/user/{username}" ;
    public static String GET_USER_LOGIN = Constant.BASE_URL+"/user/login" ;
    public static String GET_USER_LOGOUT = Constant.BASE_URL+"/user/logout" ;
    public static String POST_CREATE_USER = Constant.BASE_URL+"/user" ;

// step buat pet




// step buat store




//step buat user





}
