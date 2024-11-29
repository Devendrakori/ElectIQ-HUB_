package grp1.ElecIQ_Complete_Project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import grp1.ElecIQ_Complete_Project.entity.Candidate;
import grp1.ElecIQ_Complete_Project.service.CandidateService;

@RestController
public class CandidateController {

	@Autowired
	CandidateService service;

	@GetMapping("/showCandidate")
	public Candidate getCandidateAPI(@RequestParam int cid) {
		return service.getCandidate(cid);
	}

	@GetMapping("/showCandidates")
	public List<Candidate> getCandidatesAPI() {
		return service.getCandidates();
	}

	@PostMapping("/addCandidate")
	public String setCandidateAPI(@RequestBody Candidate c) {
		return service.setCandidate(c);
	}

	@PostMapping("/addCandidates")
	public String setCandidatesAPI(@RequestBody List<Candidate> c) {
		return service.setCandidates(c);
	}

	@PutMapping("/updateCandidate")
	public String updateCandidateAPI(@RequestParam("id") int cid, @RequestParam String name, @RequestParam int age,
			@RequestParam String gender, @RequestParam String assembly, @RequestParam String party,
			@RequestParam String state) {
		return service.updateCandidate(cid, name, age, gender, assembly, party, state);
	}

	@PatchMapping("/updateCandidateName")
	public String updateCandidateNameAPI(@RequestParam("id") int cid, @RequestParam String name) {
		return service.updateCandidateName(cid, name);
	}

	@GetMapping("/showCandidateByParty")
	public List<Candidate> getCandidateByPartyAPI(@RequestParam String party) {
		return service.getCandidateByParty(party);
	}

	@GetMapping("/showCandidateByGender")
	public List<Candidate> getCandidateByGenderAPI(@RequestParam String gender) {
		return service.getCandidateByGender(gender);
	}
}
