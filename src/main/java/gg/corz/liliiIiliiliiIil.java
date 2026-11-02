package gg.corz;

import java.util.Locale;

public final class liliiIiliiliiIil {
   public double iIIIiilIil;
   public double lIIIiilIil;
   public long iiiililIil;
   public long IIIIiilIil;

   public void liiiIIllIl(double rawDrift) {
      this.lIIIiilIil = Math.max(this.lIIIiilIil, Math.abs(rawDrift));
   }

   public void IliIlllilIi(float currentYaw, float desiredWrapped, float chosenContinuous) {
      this.iiiililIil = this.iiiililIil + (long)iiiiIiilIIIIliil.IilliliilIIi(currentYaw, desiredWrapped);
      if (!iiiiIiilIIIIliil.lIiiIiIlilli(currentYaw, chosenContinuous)) {
         this.IIIIiilIil++;
      }

      this.iIIIiilIil = Math.max(this.iIIIiilIil, (double)Math.abs(iiiiIiilIIIIliil.iIlIlllllill(currentYaw, desiredWrapped)));
   }

   public void iIlIlllllill() {
      this.iiiililIil = this.IIIIiilIil = 0L;
      this.lIIIiilIil = this.iIIIiilIil = 0.0;
   }

   public String IilliliilIIi() {
      return String.format(
         Locale.ROOT,
         lIiiIiIlilli<"lIiiIiIlilli","ZkX2Ga8Q5fg8q0XlEB8Iu9B2AFSy+xy3+MKQctiGHKvE5BKPhgmfWeBcjfsBxs11THoLUAt9vzGEZwPVR9bsa/S8ddrSd32zPr/C+OVYIzLjZ4OitrahVR3Vjjo+RCWc4uI2cueLHRoWQzvL7w5UBYfQWSnYP74IzMB8v2/uk72SJYsoBZgTF4s=">(),
         this.iiiililIil,
         this.IIIIiilIil,
         this.lIIIiilIil,
         this.iIIIiilIil
      );
   }
}
