/**
 * DB-LOCK-POC
 * 라라벨에 스웨거 적용 테스트를 위한 프로젝트
 *
 * OpenAPI spec version: 1
 * Contact: juwonkim@me.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */


import ApiClient from '../ApiClient';
import LoginRequest from './LoginRequest';





/**
* The NewUserRequest model module.
* @module model/NewUserRequest
* @version 1
*/
export default class NewUserRequest {
    /**
    * Constructs a new <code>NewUserRequest</code>.
    * @alias module:model/NewUserRequest
    * @class
    * @implements module:model/LoginRequest
    * @param email {String} 사용자 이메일
    * @param password {String} 사용자 비밀번호 (6 글자 이상)
    */

    constructor(email, password) {
        

        
        LoginRequest.call(this, email, password);

        

        
    }

    /**
    * Constructs a <code>NewUserRequest</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/NewUserRequest} obj Optional instance to populate.
    * @return {module:model/NewUserRequest} The populated <code>NewUserRequest</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NewUserRequest();

            
            
            LoginRequest.constructFromObject(data, obj);

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }

    /**
    * 사용자 이름
    * @member {String} name
    */
    name = undefined;


    // Implement LoginRequest interface:
    /**
    * 사용자 이메일
    * @member {String} email
    */
    email = undefined;
/**
    * 사용자 비밀번호 (6 글자 이상)
    * @member {String} password
    */
    password = undefined;







}


