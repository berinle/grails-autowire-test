package com.jrock



import grails.test.mixin.*
import org.junit.*
import grails.test.mixin.services.ServiceUnitTestMixin

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
//@TestFor(ShopService)
@TestMixin(ServiceUnitTestMixin)
class ShopServiceTests {

	@Before
	void setUp(){
		defineBeans{ payment(com.jrock.PaymentImpl, key:'testKey') }
		testFor(ShopService)
	}

    void testSomething() {
    	assert service.payment != null 
    	assert service.payment.key == 'testKey'
    	service.serviceMethod()
    }
}
