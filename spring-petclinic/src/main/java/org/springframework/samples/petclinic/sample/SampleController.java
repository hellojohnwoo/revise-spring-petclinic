package org.springframework.samples.petclinic.sample;

public class SampleController {
    SampleRepository sampleRepository;

    public SampleController(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;   // but, Constructor is just ONE
    }

    public void doSomething() {
        sampleRepository.save();        // null point exception
    }

}
