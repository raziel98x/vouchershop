package pl.lkowalczyk.vouchershop.catalog.exceptions;

public class ProductCatalogException extends IllegalStateException {
    public ProductCatalogException(String message) {
        super(message);
    }
}
