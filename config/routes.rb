Rails.application.routes.draw do
  root to: 'charts#dashboard'

  get 'charts/dashboard'
  # For details on the DSL available within this file, see https://guides.rubyonrails.org/routing.html
end
