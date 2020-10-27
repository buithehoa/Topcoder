Rails.application.routes.draw do
  root to: 'charts#best_seller_products'

  get 'charts/activity_by_week_month'
  get 'charts/average_purchases_by_vendor'
  get 'charts/best_seller_products'
  # For details on the DSL available within this file, see https://guides.rubyonrails.org/routing.html
end
