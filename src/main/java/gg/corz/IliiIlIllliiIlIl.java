package gg.corz;

import java.util.Locale;

public record IliiIlIllliiIlIl(boolean go, IIIillIllIIillIl reason, double roi, IiiIlIiliiIlIi best) {
   private final IIIillIllIIillIl ilIlllIiIl;
   private final IiiIlIiliiIlIi liIlllIiIl;
   private final boolean llIlllIiIl;
   private final double IiIlllIiIl;

   public IIIillIllIIillIl iIlIlllllill() {
      return this.ilIlllIiIl;
   }

   public String IliIlllilIi() {
      return (
            this.llIlllIiIl
               ? iliIiiliiiii<"iliIiiliiiii","Tt+e9hOEy1s64PPJA6Jm4/fHB6v+NcF/FqCt0PHk">()
               : iliIiiliiiii<"iliIiiliiiii","EDtS9Y1X6yoki2871Pc34DDKJoWbB1HcNbBojFXqmw2o0A==">()
         )
         + iliIiiliiiii<"iliIiiliiiii","jaSG/VaIWoiN38BYTQwGPJxrAbjbFTaZmfC/0XwPdVTDjf/s">()
         + this.ilIlllIiIl
         + iliIiiliiiii<"iliIiiliiiii","Qw7KRi00D9H1T7iZTJUjdpdE/dWjYhZh6Ag0gxR/Vrj7">()
         + String.format(Locale.ROOT, iliIiiliiiii<"iliIiiliiiii","oEE2IBII5/Ax63hSMOmWSv4HD24qhx2ghAM7TgkBAX0=">(), this.IiIlllIiIl)
         + (this.liIlllIiIl == null ? "" : iliIiiliiiii<"iliIiiliiiii","WGAuEbxJ0g7geeWo254YO3otOfEZZuwx8EyuM00TacTr">() + this.liIlllIiIl.iIlIlllllill());
   }

   public IliiIlIllliiIlIl(boolean go, IIIillIllIIillIl reason, double roi, IiiIlIiliiIlIi best) {
      this.llIlllIiIl = go;
      this.ilIlllIiIl = reason;
      this.IiIlllIiIl = roi;
      this.liIlllIiIl = best;
   }

   public boolean liiiIIllIl() {
      return this.llIlllIiIl;
   }

   public double IilliliilIIi() {
      return this.IiIlllIiIl;
   }

   public IiiIlIiliiIlIi lIiiIiIlilli() {
      return this.liIlllIiIl;
   }
}
