SELECT 
    p.product_id,                          -- 1. Show product ID
    ROUND(
      COALESCE(
        SUM(u.units * p.price) * 1.0           -- 2. Total revenue
        / SUM(u.units),                    -- 3. Divided by total units
      0),                                  -- 4. If NULL (no sales) → use 0
    2) AS average_price                    -- 5. Round to 2 decimal places

FROM Prices p                              -- 6. Start with ALL products
LEFT JOIN UnitsSold u                      -- 7. Attach sales data if exists
    ON p.product_id = u.product_id         -- 8. Same product
    AND u.purchase_date                    -- 9. Sale date must fall
        BETWEEN p.start_date               --    within the price
        AND p.end_date                     --    period

GROUP BY p.product_id;                     -- 10. Calculate per product