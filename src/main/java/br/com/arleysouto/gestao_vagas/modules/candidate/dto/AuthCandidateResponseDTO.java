package br.com.arleysouto.gestao_vagas.modules.candidate.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor //construtos vazio
@AllArgsConstructor //construtos com parametros
public class AuthCandidateResponseDTO {
    private String access_token;
    private Long expire_in;
}
