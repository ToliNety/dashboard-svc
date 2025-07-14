package rent.vehicle.dashboardserviceapi.device.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import rent.vehicle.dashboardserviceapi.device.config.CustomPage;
import rent.vehicle.dto.ListVehiclesRequest;
import rent.vehicle.dto.PointFromLatLonDto;
import rent.vehicle.dto.VehicleCreateUpdateDto;
import rent.vehicle.dto.VehicleDto;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService{
    @Override
    public Mono<VehicleDto> createVehicle(VehicleCreateUpdateDto vehicleCreateUpdateDto) {
        return null;
    }

    @Override
    public Mono<VehicleDto> updateVehicle(long id, VehicleCreateUpdateDto vehicleCreateUpdateDto) {
        return null;
    }

    @Override
    public Mono<VehicleDto> findVehicleById(long id) {
        return null;
    }

    @Override
    public Mono<CustomPage<VehicleDto>> findAllVehicle(Pageable pageable) {
        return null;
    }

    @Override
    public Mono<CustomPage<VehicleDto>> getListVehiclesByParam(ListVehiclesRequest listVehiclesRequest, Pageable pageable) {
        return null;
    }

    @Override
    public void removeVehicle(long id) {

    }

    @Override
    public Mono<CustomPage<VehicleDto>> findNearbyVehicles(PointFromLatLonDto pointFromLatLonDto, long radiusMeters, Pageable pageable) {
        return null;
    }
}
