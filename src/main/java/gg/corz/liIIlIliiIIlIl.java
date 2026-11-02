package gg.corz;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public final class liIIlIliiIIlIl {
   private long lliiiiiIliliiiiiIl;
   public int ilIIIIIllIiIIIIIll;
   public final Map<iliiliIlIiiiliIl, Integer> IIlIIIIlllIlIIIIll;
   public int IiiiiiiIlliiiiiiIl;
   public int iiiiiiiIlIIIIIIIll;
   public int IlIIIIIllllIIIIIll;
   private ilillillIiillill iIiiiiiIlIliiiiiIl;
   public int lIIIIIIlliIIIIIIll;
   public String liIIIIIlliiIIIIIll = IiIlliIliiIl<"IiIlliIliiIl","eJSKMvSAhdGqANz7LDTGdf1pL/SAqlS0LyIi2bqoWCk=">();

   public void IlIlllIlilIl() {
      this.iIiiiiiIlIliiiiiIl = null;
      this.lliiiiiIliliiiiiIl = 0L;
      this.IiiiiiiIlliiiiiiIl = this.iiiiiiiIlIIIIIIIll = this.lIIIIIIlliIIIIIIll = this.IlIIIIIllllIIIIIll = this.ilIIIIIllIiIIIIIll = 0;
      this.liIIIIIlliiIIIIIll = IiIlliIliiIl<"IiIlliIliiIl","eJSKMvSAhdGqANz7LDTGdf1pL/SAqlS0LyIi2bqoWCk=">();
      this.IIlIIIIlllIlIIIIll.clear();
   }

   public void iliIiiliiiii(iliiliIlIiiiliIl failure) {
      this.IIlIIIIlllIlIIIIll.merge(failure, 1, Integer::sum);
   }

   public boolean liiiIIllIl() {
      return this.iIiiiiiIlIliiiiiIl != null;
   }

   public IlIiIiIillIiIiIi IIIllIIliIIl(
      ilIllillIiIllill<?> safeDestination, long action, boolean grounded, boolean placementProof, Long feet, BooleanSupplier surfaceCell
   ) {
      if (!grounded || action != safeDestination.lIiiIIiill) {
         return IlIiIiIillIiIiIi.ilillIiIIi;
      } else if (!placementProof) {
         safeDestination.Illlllllilll(IiIlliIliiIl<"IiIlliIliiIl","PlD8nudU2GCPFtj3Un1j7qUL4stfRvmFbgNO3dwfURJ23WUN3HyVRMFiFwTOYg==">());
         return IlIiIiIillIiIiIi.iIIilIiIIi;
      } else if (!safeDestination.IlIlllIlilIl(action)) {
         return IlIiIiIillIiIiIi.iIIilIiIIi;
      } else if (safeDestination.liiiIIllIl()) {
         if (!surfaceCell.getAsBoolean()) {
            safeDestination.Illlllllilll(IiIlliIliiIl<"IiIlliIliiIl","6WUUCQlOT3vcDMGEsVv4N/XDFsLe/5aIrxHTRxO+FmSq0W3cp+263mtfunyI4sSYTQo=">());
            return IlIiIiIillIiIiIi.iIIilIiIIi;
         } else {
            return IlIiIiIillIiIiIi.lIIilIiIIi;
         }
      } else if (safeDestination.IiliIIiill != lIIiIIiiIIiIIi.llIIiiiliilIIiiili || feet != null && feet == action) {
         safeDestination.IilliliilIIi(action);

         return switch (safeDestination.IiliIIiill) {
            case IIIIiiililIIIiiili -> IlIiIiIillIiIiIi.IiillIiIIi;
            case iIIIiiiliIlIIiiili -> IlIiIiIillIiIiIi.liillIiIIi;
            case llIIiiiliilIIiiili -> IlIiIiIillIiIiIi.iiillIiIIi;
            default -> IlIiIiIillIiIiIi.IIIilIiIIi;
         };
      } else {
         safeDestination.Illlllllilll(IiIlliIliiIl<"IiIlliIliiIl","IuUAfRkfPogeH3TRJZwXS5t5XmsLa51q2KhtzuF+CdBIHglycmLCQWzMqhTVMgGl0Z8=">());
         return IlIiIiIillIiIiIi.iIIilIiIIi;
      }
   }

   public boolean iIlIlllllill(Illillillllillil intent) {
      return this.iIiiiiiIlIliiiiiIl == intent.lIiiIiIlilli() && this.lliiiiiIliliiiiiIl == intent.iliIiiliiiii();
   }

   public void IilliliilIIi(String reason) {
      if (this.iIiiiiiIlIliiiiiIl != null) {
         this.lIIIIIIlliIIIIIIll++;
         this.liIIIIIlliiIIIIIll = reason;
      }

      this.iIiiiiiIlIliiiiiIl = null;
      this.lliiiiiIliliiiiiIl = 0L;
   }

   public liIIlIliiIIlIl() {
      this.IIlIIIIlllIlIIIIll = new LinkedHashMap<>();
   }

   public void IliIlllilIi(ilillillIiillill owner, long id) {
      if (this.iIiiiiiIlIliiiiiIl != null) {
         throw new IllegalStateException(
            IiIlliIliiIl<"IiIlliIliiIl","SY12dHc67ZKJfOVyLr/4I8v2chg5pAqWoHyhjYcnxDpA+kfX7BtkkRt782dlvoKy+w61bTGWfr40XkC8k5iaxvUtlehzmgZsy+Y=">()
         );
      } else {
         this.iIiiiiiIlIliiiiiIl = owner;
         this.lliiiiiIliliiiiiIl = id;
         this.IiiiiiiIlliiiiiiIl++;
      }
   }

   public iliiliIlIiiiliIl lIiiIiIlilli(Illillillllillil physical, Supplier<iliiliIlIiiiliIl> intent, BooleanSupplier globalRoi) {
      if (physical.IliIlllilIi() && !this.iIlIlllllill(physical)) {
         return iliiliIlIiiiliIl.lIIllIIlll;
      } else if (!physical.IliIlllilIi() && this.iIiiiiiIlIliiiiiIl != null) {
         return iliiliIlIiiiliIl.IIIllIIlll;
      } else {
         iliiliIlIiiiliIl var4 = (iliiliIlIiiiliIl)intent.get();
         if (var4 != iliiliIlIiiiliIl.IliIlIIlll) {
            return var4;
         } else if (physical.IliIlllilIi()) {
            this.iiiiiiiIlIIIIIIIll++;
            return iliiliIlIiiiliIl.IliIlIIlll;
         } else {
            this.IiiiiiiIlliiiiiiIl++;
            this.IlIIIIIllllIIIIIll++;
            return globalRoi.getAsBoolean() ? iliiliIlIiiiliIl.IliIlIIlll : iliiliIlIiiiliIl.IIIllIIlll;
         }
      }
   }
}
