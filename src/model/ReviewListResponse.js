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
import ReviewDto from './ReviewDto';





/**
* The ReviewListResponse model module.
* @module model/ReviewListResponse
* @version 1
*/
export default class ReviewListResponse {
    /**
    * Constructs a new <code>ReviewListResponse</code>.
    * @alias module:model/ReviewListResponse
    * @class
    * @param data {Array.<module:model/ReviewDto>} 
    * @param meta {Object} 
    */

    constructor(data, meta) {
        

        
        

        this['data'] = data;this['meta'] = meta;

        
    }

    /**
    * Constructs a <code>ReviewListResponse</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ReviewListResponse} obj Optional instance to populate.
    * @return {module:model/ReviewListResponse} The populated <code>ReviewListResponse</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReviewListResponse();

            
            
            

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [ReviewDto]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/ReviewDto>} data
    */
    data = undefined;
    /**
    * @member {Object} meta
    */
    meta = undefined;








}


