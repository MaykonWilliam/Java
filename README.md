# Projeto de Estudo - Hotelaria

## Levantamento de Requisitos

### Nescessidades dos envolvidos

Os quartos podem ser alugados quando o hóspede chega ao hotel *(desde que existam vagas)* ou serem reservados via internet.
Caso seja a primeira vez que o hóspede aluga quartos ou seus dados tenham sofrido alterações, o hóspede deve ser cadastrado antes de finalizar o aluguel do quarto.
Além do aluguel do quarto, o hotel oferece diversos serviços como restaurante, lavar e/ou passar roupas. Obviamente, qualquer desses serviços, se solicitado, será cobrado na fatura final.
O hóspede pode também consumir os produtos contidos no frigobar, que também são cobrados pelo hotel.
As diárias vencem ao meio-dia. A política do hotel exige que as diárias sejam quitadas semanalmente. Quando o cliente for quitar a fatura, quitará não somente as diárias do(s) quarto(s) que alugou, mas também qualquer serviço que tenha solicitado e os itens consumidos no frigobar.
O hóspede, depois de quitar a fatura, pode permanecer no hotel por um novo período que será renovado ou encerrar sua estadia.

### Documento de Visão

##### 1\. Introdução

Este documento descreve o sistema de gestão de hotel a ser desenvolvido para facilitar o processo de reserva, aluguel de quartos, prestação de serviços e cobrança de diárias. O sistema permitirá que os hóspedes façam reservas via internet ou aluguem quartos presencialmente no hotel, garantindo a gestão eficiente dos serviços prestados e dos itens consumidos, além do gerenciamento das faturas.

##### 2\. Objetivos

Automatizar o processo de aluguel de quartos, tanto online quanto presencialmente.
Permitir o cadastro de novos hóspedes e atualização de dados dos mesmos.
Integrar a prestação de serviços do hotel (restaurante, lavanderia, frigobar) ao sistema de cobrança.
Gerar faturas automáticas para quitação das diárias e serviços utilizados.
Renovar a estadia ou encerrar automaticamente quando o pagamento das faturas for efetuado.

##### 3\. Escopo

###### 3.1. Escopo Funcional

* **Aluguel de Quartos:** Hóspedes poderão alugar quartos tanto no momento da chegada ao hotel, quanto fazer reservas pela internet. Caso não existam quartos disponíveis, o sistema deverá informar.
* **Cadastro de Hóspedes:** Será necessário cadastrar novos hóspedes ou atualizar os dados dos mesmos antes de finalizar o aluguel do quarto, se aplicável.
* **Serviços Adicionais:** O hotel oferece serviços de restaurante, lavanderia, e frigobar. O sistema permitirá que os hóspedes solicitem e sejam cobrados por esses serviços.
* **Cobrança:** O sistema gerará faturas semanais, que incluirão o valor das diárias, serviços adicionais e itens consumidos no frigobar.
* **Renovação/Encerramento de Estadia:** O hóspede poderá renovar a estadia quitando a fatura ou encerrar sua permanência após o pagamento.

###### 3.2. Escopo Não Funcional

* **Segurança:** O sistema deverá garantir a segurança dos dados pessoais e de pagamento dos hóspedes, adotando criptografia e controle de acessos.
* **Usabilidade:** Interface amigável tanto para hóspedes quanto para o pessoal da recepção do hotel.
* **Escalabilidade:** O sistema deve suportar um grande volume de transações simultâneas, especialmente em épocas de alta demanda.
* **Disponibilidade:** O sistema de reservas online deve estar disponível 24/7.

##### 4\. Usuários e Intervenientes

* **Hóspedes:** Usuários que podem fazer reservas, solicitar serviços e realizar pagamentos.
* **Recepcionistas:** Funcionários do hotel responsáveis pelo atendimento presencial e pelo cadastro de novos hóspedes.
* **Gerência:** Responsável por monitorar o funcionamento do hotel e gerar relatórios gerenciais.

##### 5\. Requisitos Funcionais

| Referencia | Requisito                                                                                          |
| ---------- | -------------------------------------------------------------------------------------------------- |
| RF01:      | O sistema deve permitir o cadastro e a atualização dos dados dos hóspedes.                         |
| RF02:      | O sistema deve permitir a consulta e reserva de quartos disponíveis pela internet.                 |
| RF03:      | O sistema deve permitir a solicitação de serviços (restaurante, lavanderia) durante a estadia.     |
| RF04:      | O sistema deve gerar faturas semanais com o valor das diárias, serviços e consumos.                |
| RF05:      | O sistema deve permitir o pagamento das faturas com opção de renovação ou encerramento da estadia. |

##### 6\. Requisitos Não Funcionais
| Referencia | Requisito                                                                              |
| ---------- | -------------------------------------------------------------------------------------- |
| RNF01      | O sistema deve suportar, no mínimo, 500 usuários simultâneos.                          |
| RNF02      | O sistema deve utilizar criptografia para garantir a segurança dos dados dos usuários. |
| RNF03      | O sistema deve ser acessível via desktop e dispositivos móveis.                        |

##### 7\. Riscos
Falha na integração dos serviços de restaurante e lavanderia pode gerar inconsistências nas cobranças.
Alto tráfego de usuários pode causar lentidão ou indisponibilidade do sistema.

##### 8\. Conclusão
Este sistema visa facilitar o gerenciamento de aluguéis, serviços e cobranças, promovendo uma experiência mais eficiente para hóspedes e equipe do hotel, além de otimizar a operação do estabelecimento.
