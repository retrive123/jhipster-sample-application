package io.github.jhipster.application.service.impl;

import io.github.jhipster.application.service.ProductDetailsService;
import io.github.jhipster.application.domain.ProductDetails;
import io.github.jhipster.application.repository.ProductDetailsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing ProductDetails.
 */
@Service
@Transactional
public class ProductDetailsServiceImpl implements ProductDetailsService {

    private final Logger log = LoggerFactory.getLogger(ProductDetailsServiceImpl.class);

    private final ProductDetailsRepository productDetailsRepository;

    public ProductDetailsServiceImpl(ProductDetailsRepository productDetailsRepository) {
        this.productDetailsRepository = productDetailsRepository;
    }

    /**
     * Save a productDetails.
     *
     * @param productDetails the entity to save
     * @return the persisted entity
     */
    @Override
    public ProductDetails save(ProductDetails productDetails) {
        log.debug("Request to save ProductDetails : {}", productDetails);
        return productDetailsRepository.save(productDetails);
    }

    /**
     * Get all the productDetails.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<ProductDetails> findAll() {
        log.debug("Request to get all ProductDetails");
        return productDetailsRepository.findAll();
    }


    /**
     * Get one productDetails by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<ProductDetails> findOne(Long id) {
        log.debug("Request to get ProductDetails : {}", id);
        return productDetailsRepository.findById(id);
    }

    /**
     * Delete the productDetails by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete ProductDetails : {}", id);
        productDetailsRepository.deleteById(id);
    }
}
