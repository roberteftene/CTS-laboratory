package robert.eftene.g1092.builder;

import javax.xml.ws.Service;
import javax.xml.ws.ServiceMode;
import java.util.HashMap;
import java.util.Map;

public class ServiceModel {
    private String name;
    private String description;
    private ServiceCategory category;
    private Map<String, String> workingHours = new HashMap<>();
    private Map<String, Double> prices = new HashMap<>();
    private String location;
    private String phone;
    private String email;

    private ServiceModel() { }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ServiceCategory getCategory() {
        return category;
    }

    public Map<String, String> getWorkingHours() {
        return workingHours;
    }

    public Map<String, Double> getPrices() {
        return prices;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(ServiceCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ServiceModel{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", workingHours=" + workingHours +
                ", prices=" + prices +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class ServiceBuilder {
        private ServiceModel serviceModel;

        public ServiceBuilder(String name, String description, ServiceCategory serviceCategory) {
            this.serviceModel = new ServiceModel();
            this.serviceModel.setName(name);
            this.serviceModel.setDescription(description);
            this.serviceModel.setCategory(serviceCategory);
        }

        public ServiceBuilder setWorkingHours(Map<String,String> workingHours) {
            this.serviceModel.workingHours = workingHours;
            return this;
        }

        public ServiceBuilder setPrices(Map<String, Double> prices) {
            this.serviceModel.prices = prices;
            return this;
        }

        public ServiceBuilder setLocation(String location) {
            this.serviceModel.location = location;
            return this;
        }

        public ServiceBuilder setPhone(String phone) {
            this.serviceModel.phone = phone;
            return this;
        }

        public ServiceBuilder setEmail(String email) {
            this.serviceModel.email = email;
            return this;
        }

        public ServiceModel build() {
            return this.serviceModel;
        }
    }
}
