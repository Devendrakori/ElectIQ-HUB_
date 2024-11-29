package grp1.ElecIQ_Complete_Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grp1.ElecIQ_Complete_Project.dao.CandidateDao;
import grp1.ElecIQ_Complete_Project.entity.Candidate;

@Service
public class CandidateService {

	@Autowired
	CandidateDao cd;

	public Candidate getCandidate(int cid) {
		return cd.getCandidate(cid);
	}

	public String setCandidate(Candidate c) {
		return cd.setCandidate(c);
	}

	public String setCandidates(List<Candidate> c) {
		return cd.setCandidates(c);
	}

	public List<Candidate> getCandidates() {
		return cd.getCandidates();
	}

	public String updateCandidate(int cid, String name, int age, String gender, String assembly, String party,
			String state) {
		return cd.updateCandidate(cid, name, age, gender, assembly, party, state);
	}

	public String updateCandidateName(int cid, String name) {
		return cd.updateCandidateName(cid, name);
	}

	public List<Candidate> getCandidateByParty(String party) {
		return cd.getCandidateByParty(party);
	}

	public List<Candidate> getCandidateByGender(String gender) {
		return cd.getCandidateByGender(gender);
	}
}
