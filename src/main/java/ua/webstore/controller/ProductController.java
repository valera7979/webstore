package ua.webstore.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ua.webstore.domain.Product;
import ua.webstore.domain.repository.ProductRepository;
import ua.webstore.service.ProductService;

import static org.springframework.util.StringUtils.arrayToCommaDelimitedString;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping
    public String list(Model model) {
        model.addAttribute("products", productService.
                getAllProducts());
        return "products";
    }

    @RequestMapping("/all")
    public String allProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/product")
    public String getProductById(@RequestParam("id")
                                         String productId, Model model) {
        model.addAttribute("product", productService.getProductById(productId));
        return "product";
    }

    @RequestMapping("/{category}")
    public String getProductsByCategory(Model model,
                                        @PathVariable("category") String productCategory) {
        model.addAttribute("products", productService.getProductsByCategory(productCategory));
        return "products";
    }

    @RequestMapping("/filter/{ByCriteria}")
    public String getProductsByFilter(@MatrixVariable(pathVar =
            "ByCriteria") Map<String, List<String>> filterParams,
                                      Model model) {
        model.addAttribute("products",
                productService.getProductsByFilter(filterParams));

        return "products";

    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAddNewProductForm(Model model) {
        Product newProduct = new Product();
        model.addAttribute("newProduct", newProduct);
        return "addProduct";
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processAddNewProductForm(
            @ModelAttribute("newProduct") Product productToBeAdded,
            BindingResult result) {
        String[] suppressedFields = result.getSuppressedFields();
        /*if (suppressedFields.length > 0) {
            throw new RuntimeException("Attempting to bind"+
                    "disallowed fields: " + StringUtils.
            arrayToCommaDelimitedString(suppressedFields));
        }*/
        productService.addProduct(productToBeAdded);
        return "redirect:/products";
    }

    @InitBinder
    public void initialiseBinder(WebDataBinder binder) {
        binder.setDisallowedFields("unitsInOrder", "discontinued");
    }




}