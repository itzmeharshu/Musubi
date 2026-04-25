@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor // This injects the Service automatically
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public String createProduct(@RequestBody Product product) {
        productService.createProduct(product);
        return "Product " + product.getName() + " created in Musubi!";
    }
}