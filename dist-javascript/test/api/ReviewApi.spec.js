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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.DbLockPoc);
  }
}(this, function(expect, DbLockPoc) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new DbLockPoc.ReviewApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('ReviewApi', function() {
    describe('createReview', function() {
      it('should call createReview successfully', function(done) {
        //uncomment below and update the code to test createReview
        //instance.createReview(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteReview', function() {
      it('should call deleteReview successfully', function(done) {
        //uncomment below and update the code to test deleteReview
        //instance.deleteReview(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listReviews', function() {
      it('should call listReviews successfully', function(done) {
        //uncomment below and update the code to test listReviews
        //instance.listReviews(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateReview', function() {
      it('should call updateReview successfully', function(done) {
        //uncomment below and update the code to test updateReview
        //instance.updateReview(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
