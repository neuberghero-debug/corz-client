package gg.corz;

final class ililIIliIiilIIli {
   String iiiIilIlIi;
   String liiIilIlIi = "";
   float iIIlilIlIi;
   float IlIlilIlIi;
   int IIIlilIlIi;
   int lIIlilIlIi;

   void liiiIIllIl(ililIIliIiilIIli other) {
      this.liiIilIlIi = other.liiIilIlIi;
      this.iiiIilIlIi = other.iiiIilIlIi;
      this.IIIlilIlIi = other.IIIlilIlIi;
      this.lIIlilIlIi = other.lIIlilIlIi;
      this.iIIlilIlIi = other.iIIlilIlIi;
      this.IlIlilIlIi = other.IlIlilIlIi;
   }

   boolean iIlIlllllill(String rest, String restCol, int leadCol, int lead) {
      return this.IIIlilIlIi == leadCol && this.lIIlilIlIi == lead && this.liiIilIlIi.equals(rest) && this.iiiIilIlIi.equals(restCol);
   }

   private ililIIliIiilIIli() {
      this.iiiIilIlIi = "";
   }

   void IliIlllilIi(IIliiIlllIliiIll restCol, String font, String lead, int rest, int leadCol) {
      this.liiIilIlIi = font;
      this.iiiIilIlIi = lead;
      this.IIIlilIlIi = rest;
      this.lIIlilIlIi = leadCol;
      this.iIIlilIlIi = restCol.iIlIlllllill(font);
      this.IlIlilIlIi = this.iIIlilIlIi + (lead.isEmpty() ? 0.0F : restCol.iIlIlllllill(lead));
   }
}
