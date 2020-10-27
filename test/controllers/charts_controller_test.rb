require 'test_helper'

class ChartsControllerTest < ActionDispatch::IntegrationTest
  test "should get best_seller_products" do
    get charts_best_seller_products_url
    assert_response :success
  end

end
