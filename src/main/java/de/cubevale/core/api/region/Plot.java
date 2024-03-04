package de.cubevale.core.api.region;

import javax.annotation.CheckReturnValue;

public interface Plot extends Region {

    /**
     * Get the internal plot id
     * @return
     */
    int getId();

    /**
     * Get the unique identifier of the plot
     * @return
     */
    String getIdentifier();

    /**
     * Set the unique identifier of the plot
     * @param identifier identifier as string
     * @return
     */
    @CheckReturnValue
    default Plot setIdentifier(String identifier) {
        return this;
    }

    /**
     * Get the current status of the plot
     * @return
     */
    Plot.PlotStatus getPlotStatus();

    /**
     * Set the current status of the plot
     * @param plotStatus plot status
     * @return
     */
    @CheckReturnValue
    default Plot setPlotStatus(Plot.PlotStatus plotStatus) {
        return this;
    }

    /**
     * Get the basis price of the plot
     * @return
     */
    double getBasicPrice();

    /**
     * Set the basis price of the plot
     * @param price
     * @return
     */
    @CheckReturnValue
    default Plot setBasicPrice(double price) {
        return this;
    }

    /**
     * Get the adjacent street of the plot
     * @return
     */
    Street getStreet();

    /**
     * Set the adjacent street of the plot
     * @param street
     * @return
     */
    @CheckReturnValue
    default Plot setStreet(Street street) {
        return this;
    }

    enum PlotStatus {
        FOR_SALE("for_sale"),
        SOLD("sold"),
        FOR_RENT("for_rent"),
        RENTED("rented"),
        BLOCKED("blocked");

        private final String status;

        PlotStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }
    }
}
