# api-2

# WORK IN PROGRESS. NOT READY FOR PRODUCTION USE.
## Comments and pull requests welcome.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.vendhq</groupId>
    <artifactId>api-2</artifactId>
    <version>2.0.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.vendhq:api-2:2.0.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/api-2-2.0.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.vendhq.api_2.*;
import com.vendhq.api_2.auth.*;
import com.vendhq.models_2.*;
import com.vendhq.api_2.BrandsApi;

import java.io.File;
import java.util.*;

public class BrandsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: personal_token
        ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
        personal_token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
        //personal_token.setApiKeyPrefix("Bearer");

        BrandsApi apiInstance = new BrandsApi();
        String brandId = "brandId_example"; // String | Valid brand ID.
        try {
            BrandResponse result = apiInstance.getBrandByID(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#getBrandByID");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BrandsApi* | [**getBrandByID**](docs/BrandsApi.md#getBrandByID) | **GET** /brands/{brand_id} | Get a single brand
*BrandsApi* | [**listBrands**](docs/BrandsApi.md#listBrands) | **GET** /brands | List brands
*ConsignmentsApi* | [**adjustInventoryItemCount**](docs/ConsignmentsApi.md#adjustInventoryItemCount) | **POST** /consignments/{consignment_id}/products | Adjust the inventory item count
*ConsignmentsApi* | [**createInventoryCount**](docs/ConsignmentsApi.md#createInventoryCount) | **POST** /consignments | Create an inventory count
*ConsignmentsApi* | [**deleteConsignmentByID**](docs/ConsignmentsApi.md#deleteConsignmentByID) | **DELETE** /consignments/{consignment_id} | Delete a consignment
*ConsignmentsApi* | [**deleteItemFromInventoryCount**](docs/ConsignmentsApi.md#deleteItemFromInventoryCount) | **DELETE** /consignments/{consignment_id}/products/{product_id} | Delete an item from an inventory count
*ConsignmentsApi* | [**getConsignmentByID**](docs/ConsignmentsApi.md#getConsignmentByID) | **GET** /consignments/{consignment_id} | Get a single consignment
*ConsignmentsApi* | [**listConsignments**](docs/ConsignmentsApi.md#listConsignments) | **GET** /consignments | List consignments
*ConsignmentsApi* | [**listProductsByConsignmentID**](docs/ConsignmentsApi.md#listProductsByConsignmentID) | **GET** /consignments/{consignment_id}/products | List all products for a specific consignment
*ConsignmentsApi* | [**updateInventoryCountByID**](docs/ConsignmentsApi.md#updateInventoryCountByID) | **PUT** /consignments/{consignment_id} | Update an inventory count
*CustomerGroupsApi* | [**listCustomerGroups**](docs/CustomerGroupsApi.md#listCustomerGroups) | **GET** /customer_groups | List customer groups
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createCustomer) | **POST** /customers | Create a new customer
*CustomersApi* | [**deleteCustomerByID**](docs/CustomersApi.md#deleteCustomerByID) | **DELETE** /customers/{customer_id} | Delete a customer
*CustomersApi* | [**getCustomerByID**](docs/CustomersApi.md#getCustomerByID) | **GET** /customers/{customer_id} | Get a single customer
*CustomersApi* | [**listCustomers**](docs/CustomersApi.md#listCustomers) | **GET** /customers | List customers
*CustomersApi* | [**updateCustomerByID**](docs/CustomersApi.md#updateCustomerByID) | **PUT** /customers/{customer_id} | Update a customer
*InventoryApi* | [**listInventoryRecords**](docs/InventoryApi.md#listInventoryRecords) | **GET** /inventory | List inventory records
*OutletProductTaxesApi* | [**listOutletProductTaxes**](docs/OutletProductTaxesApi.md#listOutletProductTaxes) | **GET** /outlet_taxes | List outlet product taxes
*OutletsApi* | [**getOutletByID**](docs/OutletsApi.md#getOutletByID) | **GET** /outlets/{outlet_id} | Get a single outlet
*OutletsApi* | [**listOutlets**](docs/OutletsApi.md#listOutlets) | **GET** /outlets | List outlets
*PaymentTypesApi* | [**listPaymentTypes**](docs/PaymentTypesApi.md#listPaymentTypes) | **GET** /payment_types | List payment types
*PriceBookProductsApi* | [**listPriceBookProducts**](docs/PriceBookProductsApi.md#listPriceBookProducts) | **GET** /price_book_products | List price book products
*PriceBooksApi* | [**createPriceBook**](docs/PriceBooksApi.md#createPriceBook) | **POST** /price_books | Create a price book
*PriceBooksApi* | [**getPriceBookbyID**](docs/PriceBooksApi.md#getPriceBookbyID) | **GET** /price_books/{price_book_id} | Get a single price book
*PriceBooksApi* | [**listPriceBooks**](docs/PriceBooksApi.md#listPriceBooks) | **GET** /price_books | List price books
*ProductImagesApi* | [**deleteProductImageByID**](docs/ProductImagesApi.md#deleteProductImageByID) | **DELETE** /product_images/{product_image_id} | Delete a product_image
*ProductImagesApi* | [**getProductImageDataByID**](docs/ProductImagesApi.md#getProductImageDataByID) | **GET** /product_images/{product_image_id} | Get a single product_image data
*ProductImagesApi* | [**setImagePosition**](docs/ProductImagesApi.md#setImagePosition) | **PUT** /product_images/{product_image_id} | Set image position
*ProductTypesApi* | [**getProductTypeByID**](docs/ProductTypesApi.md#getProductTypeByID) | **GET** /product_types/{product_type_id} | Get a single product type
*ProductTypesApi* | [**listProductTypes**](docs/ProductTypesApi.md#listProductTypes) | **GET** /product_types | ListProductTypes
*ProductsApi* | [**getInventoryByProductID**](docs/ProductsApi.md#getInventoryByProductID) | **GET** /products/{product_id}/inventory | Get inventory data for a single product
*ProductsApi* | [**getProductByID**](docs/ProductsApi.md#getProductByID) | **GET** /products/{product_id} | Get a single product
*ProductsApi* | [**listProducts**](docs/ProductsApi.md#listProducts) | **GET** /products | List products
*ProductsApi* | [**uploadImage**](docs/ProductsApi.md#uploadImage) | **POST** /products/{product_id}/actions/image_upload | Upload an image
*RegistersApi* | [**getRegisterByID**](docs/RegistersApi.md#getRegisterByID) | **GET** /registers/{register_id} | Get a single register
*RegistersApi* | [**listRegisters**](docs/RegistersApi.md#listRegisters) | **GET** /registers | List registers
*SalesApi* | [**getSaleByID**](docs/SalesApi.md#getSaleByID) | **GET** /sales/{sale_id} | Get a single sale
*SalesApi* | [**listSales**](docs/SalesApi.md#listSales) | **GET** /sales | List Sales
*SuppliersApi* | [**getSupplierByID**](docs/SuppliersApi.md#getSupplierByID) | **GET** /suppliers/{supplier_id} | Get a single supplier
*SuppliersApi* | [**listSuppliers**](docs/SuppliersApi.md#listSuppliers) | **GET** /suppliers | List suppliers
*TagsApi* | [**getTagByID**](docs/TagsApi.md#getTagByID) | **GET** /tags/{tag_id} | Get a single tag
*TagsApi* | [**listTags**](docs/TagsApi.md#listTags) | **GET** /tags | List tags
*TaxesApi* | [**listTaxes**](docs/TaxesApi.md#listTaxes) | **GET** /taxes | List taxes
*UsersApi* | [**getUserByID**](docs/UsersApi.md#getUserByID) | **GET** /users/{user_id} | Get a single user
*UsersApi* | [**listUsers**](docs/UsersApi.md#listUsers) | **GET** /users | List users


## Documentation for Models

 - [Brand](docs/Brand.md)
 - [BrandCollection](docs/BrandCollection.md)
 - [BrandResponse](docs/BrandResponse.md)
 - [BrandSample](docs/BrandSample.md)
 - [Consignment](docs/Consignment.md)
 - [ConsignmentCollection](docs/ConsignmentCollection.md)
 - [ConsignmentProductCollection](docs/ConsignmentProductCollection.md)
 - [ConsignmentResponse](docs/ConsignmentResponse.md)
 - [Customer](docs/Customer.md)
 - [CustomerBase](docs/CustomerBase.md)
 - [CustomerCollection](docs/CustomerCollection.md)
 - [CustomerGroup](docs/CustomerGroup.md)
 - [CustomerGroupCollection](docs/CustomerGroupCollection.md)
 - [CustomerResponse](docs/CustomerResponse.md)
 - [Image](docs/Image.md)
 - [ImagePosition](docs/ImagePosition.md)
 - [ImageResponse](docs/ImageResponse.md)
 - [ImageSample](docs/ImageSample.md)
 - [Inventory](docs/Inventory.md)
 - [InventoryCollection](docs/InventoryCollection.md)
 - [InventoryCount](docs/InventoryCount.md)
 - [InventoryCountFilter](docs/InventoryCountFilter.md)
 - [InventoryCountItem](docs/InventoryCountItem.md)
 - [InventoryCountItemRequest](docs/InventoryCountItemRequest.md)
 - [InventoryCountItemResponse](docs/InventoryCountItemResponse.md)
 - [LineItem](docs/LineItem.md)
 - [LineItemTaxComponent](docs/LineItemTaxComponent.md)
 - [Outlet](docs/Outlet.md)
 - [OutletCollection](docs/OutletCollection.md)
 - [OutletResponse](docs/OutletResponse.md)
 - [OutletTax](docs/OutletTax.md)
 - [OutletTaxCollection](docs/OutletTaxCollection.md)
 - [Payment](docs/Payment.md)
 - [PaymentType](docs/PaymentType.md)
 - [PaymentTypeCollection](docs/PaymentTypeCollection.md)
 - [PaymentTypeConfig](docs/PaymentTypeConfig.md)
 - [PriceBook](docs/PriceBook.md)
 - [PriceBookBase](docs/PriceBookBase.md)
 - [PriceBookCollection](docs/PriceBookCollection.md)
 - [PriceBookProduct](docs/PriceBookProduct.md)
 - [PriceBookProductCollection](docs/PriceBookProductCollection.md)
 - [PriceBookResponse](docs/PriceBookResponse.md)
 - [Product](docs/Product.md)
 - [ProductCollection](docs/ProductCollection.md)
 - [ProductResponse](docs/ProductResponse.md)
 - [ProductType](docs/ProductType.md)
 - [ProductTypeCollection](docs/ProductTypeCollection.md)
 - [ProductTypeResponse](docs/ProductTypeResponse.md)
 - [ProductTypeSample](docs/ProductTypeSample.md)
 - [Register](docs/Register.md)
 - [RegisterCollection](docs/RegisterCollection.md)
 - [RegisterResponse](docs/RegisterResponse.md)
 - [Sale](docs/Sale.md)
 - [SaleCollection](docs/SaleCollection.md)
 - [SaleResponse](docs/SaleResponse.md)
 - [SaleTax](docs/SaleTax.md)
 - [Supplier](docs/Supplier.md)
 - [SupplierCollection](docs/SupplierCollection.md)
 - [SupplierResponse](docs/SupplierResponse.md)
 - [SupplierSample](docs/SupplierSample.md)
 - [Tag](docs/Tag.md)
 - [TagCollection](docs/TagCollection.md)
 - [TagResponse](docs/TagResponse.md)
 - [Tax](docs/Tax.md)
 - [TaxCollection](docs/TaxCollection.md)
 - [TaxRate](docs/TaxRate.md)
 - [User](docs/User.md)
 - [UserCollection](docs/UserCollection.md)
 - [UserImages](docs/UserImages.md)
 - [UserResponse](docs/UserResponse.md)
 - [VariantOption](docs/VariantOption.md)
 - [Version](docs/Version.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://secure.vendhq.com/connect
- **Scopes**: N/A

### personal_token

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

api@vendhq.com

