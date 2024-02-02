package kr.co.seoulit.erp.account.operate.system.mapstruct;

import javax.annotation.processing.Generated;
import kr.co.seoulit.erp.account.operate.system.entity.Customer;
import kr.co.seoulit.erp.account.operate.system.to.CustomerUpdateRequest;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T10:25:34+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class CustomerMapStructImpl implements CustomerMapStruct {

    @Override
    public CustomerUpdateRequest toCustomerDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerUpdateRequest.CustomerUpdateRequestBuilder customerUpdateRequest = CustomerUpdateRequest.builder();

        customerUpdateRequest.businessLicenseNumber( customer.getBusinessLicenseNumber() );
        customerUpdateRequest.customerBasicAddress( customer.getCustomerBasicAddress() );
        customerUpdateRequest.customerBusinessConditions( customer.getCustomerBusinessConditions() );
        customerUpdateRequest.customerBusinessItems( customer.getCustomerBusinessItems() );
        customerUpdateRequest.customerCeo( customer.getCustomerCeo() );
        customerUpdateRequest.customerCode( customer.getCustomerCode() );
        customerUpdateRequest.customerDetailAddress( customer.getCustomerDetailAddress() );
        customerUpdateRequest.customerFaxNumber( customer.getCustomerFaxNumber() );
        customerUpdateRequest.customerName( customer.getCustomerName() );
        customerUpdateRequest.customerTelNumber( customer.getCustomerTelNumber() );
        customerUpdateRequest.customerType( customer.getCustomerType() );
        customerUpdateRequest.customerZipCode( customer.getCustomerZipCode() );
        customerUpdateRequest.socialSecurityNumber( customer.getSocialSecurityNumber() );
        customerUpdateRequest.workplaceCode( customer.getWorkplaceCode() );

        return customerUpdateRequest.build();
    }
}
