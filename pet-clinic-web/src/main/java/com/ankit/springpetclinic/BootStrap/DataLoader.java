package com.ankit.springpetclinic.BootStrap;

import com.ankit.springpetclinic.model.Owner;
import com.ankit.springpetclinic.model.Vet;
import com.ankit.springpetclinic.services.OwnerService;
import com.ankit.springpetclinic.services.VetService;
import net.bytebuddy.description.modifier.Ownership;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * created by Ankit on 17 of Apr, 2022
 */

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Ankit");
        owner1.setLastName("Mishra");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Surendra");
        owner2.setLastName("Pathak");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Durgesh");
        vet1.setLastName("Gound");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Anshul");
        vet2.setLastName("Chaturvade");
        vetService.save(vet2);
    }
}
