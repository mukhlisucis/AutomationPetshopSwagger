package starter.swagger;

import starter.swagger.Utils.Constant;

public class PetAPI {
    //Pet
    public static String POST_IMAGE_PET = Constant.BASE_URL+"/pet/{petId}/uploadImage" ;
    public static String POST_NEW_PET = Constant.BASE_URL +"/pet" ;
    public static String PUT_UPDATE_PET = Constant.BASE_URL+"/pet";
    public static String GET_PET_STATUS = Constant.BASE_URL+"/pet/findByStatus";
    public static String GET_PET_ID = Constant.BASE_URL+"/pet/{petId}";
    public static String POST_UPDATE_PET = Constant.BASE_URL+"/pet/{petId}" ;
    public static String DELETE_PET_ID = Constant.BASE_URL+"/pet/{petId}" ;

}
