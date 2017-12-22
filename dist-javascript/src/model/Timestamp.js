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





/**
* The Timestamp model module.
* @module model/Timestamp
* @version 1
*/
export default class Timestamp {
    /**
    * Constructs a new <code>Timestamp</code>.
    * @alias module:model/Timestamp
    * @class
    */

    constructor() {
        

        
        

        

        
    }

    /**
    * Constructs a <code>Timestamp</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/Timestamp} obj Optional instance to populate.
    * @return {module:model/Timestamp} The populated <code>Timestamp</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Timestamp();

            
            
            

            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'String');
            }
            if (data.hasOwnProperty('updated_at')) {
                obj['updated_at'] = ApiClient.convertToType(data['updated_at'], 'String');
            }
        }
        return obj;
    }

    /**
    * 최초 생성 시각
    * @member {String} created_at
    */
    created_at = undefined;
    /**
    * 최종 수정 시각
    * @member {String} updated_at
    */
    updated_at = undefined;








}

