import exe1.Product;
import exe1.ShoppingCart;

public class MainEcommerce {
    public static void main(String[] args) {
        // criação dos produtos
        Product objProd1 = new Product("A", 100);
        Product objProd2 = new Product("B", 50);
        Product objProd3 = new Product("C", 500);

        // criação do carrinho de compras
        ShoppingCart objShoppingCart = new ShoppingCart(1);

        // adicionando os itens do carrinho
        objShoppingCart.addCarItem(3, objProd1);
        objShoppingCart.addCarItem(5, objProd2);
        objShoppingCart.addCarItem(1, objProd3);

        System.out.println(objShoppingCart.toString());

        objShoppingCart.valorTotal();

        objShoppingCart.removeCarItem(5, objProd2);

        System.out.println(objShoppingCart.toString());
    }
}
