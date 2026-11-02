package gg.corz;

public final class IiiiIIliliiiIIli {
   public int IIIIliIlIi;
   public int liiiIiIlIi;
   public int iliiIiIlIi;
   public int lliiIiIlIi;
   private IiIlIIIiliIlIIIi IliiIiIlIi;
   public int IiiiIiIlIi;
   public int iiiiIiIlIi;

   public IiIlIIIiliIlIIIi iIlIlllllill() {
      return this.IliiIiIlIi;
   }

   public static int IliIlllilIi(int pingMs) {
      return Math.max(2, Math.min(10, (int)Math.ceil(2.0 * (double)Math.max(0, pingMs) / 50.0) + 1));
   }

   public void iliIiiliiiii() {
      this.IliiIiIlIi = null;
   }

   public IiIlIIIiliIlIIIi liiiIIllIl(
      long sneak, long clickTick, String face, int hitY, double invBefore, double hitZ, double ping, boolean supportType, int target, int hitX, int support
   ) {
      this.IliiIiIlIi = new IiIlIIIiliIlIIIi(sneak, clickTick, face, hitY, invBefore, hitZ, ping, supportType, target, hitX, support);
      this.lliiIiIlIi++;
      return this.IliiIiIlIi;
   }

   public IlilIiIlllilIiIl lIiiIiIlilli(int timeout, boolean grace, boolean serverAcked, int blockPresent, int tick, int invNow) {
      IiIlIIIiliIlIIIi var7 = this.IliiIiIlIi;
      if (var7 == null) {
         return IlilIiIlllilIiIl.iiIiIliIll;
      } else if (var7.iiIiIIliil == IlilIiIlllilIiIl.lIliIliIll
         || var7.iiIiIIliil == IlilIiIlllilIiIl.iIliIliIll
         || var7.iiIiIIliil == IlilIiIlllilIiIl.IlliIliIll) {
         return var7.iiIiIIliil;
      } else if (grace) {
         if (var7.liIiIIliil > 0) {
            this.IIIIliIlIi++;
            var7.liIiIIliil = 0;
            var7.IIliIIliil = IlIlllIlilIl<"IlIlllIlilIl","gk7HbmrbUQkPiv4ZWOwKfRNK2EzghNQCIAh71ToljXVIwBTzBWCJNwsbRRQ/nlTW36jWz9HZx+IxztxxUJeb6RneJLcn">();
         }

         if (!var7.IliIlllilIi()) {
            var7.llIiIIliil = timeout;
            if (var7.iiIiIIliil == IlilIiIlllilIiIl.iiIiIliIll) {
               var7.iiIiIIliil = IlilIiIlllilIiIl.IIliIliIll;
               this.iliiIiIlIi++;
            }
         }

         if (serverAcked) {
            var7.iiIiIIliil = IlilIiIlllilIiIl.lIliIliIll;
            var7.IiIiIIliil = timeout;
            var7.IlIiIIliil = blockPresent;
            var7.IIliIIliil = IlIlllIlilIl<"IlIlllIlilIl","cx/fl+NcHrXb0Xisw8BiIwcbOEtQwk2noZNcfVXT3RXC2qrnzuhRCZQRpq8RKmVAP/bo7NDyya3ftxDihV5M">();
            this.IiiiIiIlIi++;
         }

         return var7.iiIiIIliil;
      } else if (var7.IliIlllilIi()) {
         if (++var7.liIiIIliil < Math.max(1, invNow)) {
            var7.iiIiIIliil = IlilIiIlllilIiIl.IIliIliIll;
            return var7.iiIiIIliil;
         } else {
            var7.iiIiIIliil = IlilIiIlllilIiIl.iIliIliIll;
            var7.IiIiIIliil = timeout;
            var7.ilIiIIliil = timeout - var7.llIiIIliil;
            var7.IlIiIIliil = blockPresent;
            var7.IIliIIliil = blockPresent >= var7.iIIiIIliil
               ? IlIlllIlilIl<"IlIlllIlilIl","99FjdaKKnguoTQfgZvuiFj8f7qtm9IuITh3XMbV8uQOAIvpigOqLcqA+5Xa5cWksv5czKZxdXACQ3dYELaEfUW93gTqWdWOOGcmOF/iDaYV5/YMOBEImnr+/TcOPrmw=">()
               : IlIlllIlilIl<"IlIlllIlilIl","gHmpJse8qM5QdfMlQ/1POmHxqdRlkC8qmIQp6fpk0hT2+Cl03F9yEyI=">();
            this.liiiIiIlIi++;
            return var7.iiIiIIliil;
         }
      } else {
         if (timeout - var7.lIIiIIliil > tick) {
            var7.iiIiIIliil = IlilIiIlllilIiIl.IlliIliIll;
            var7.IiIiIIliil = timeout;
            var7.IlIiIIliil = blockPresent;
            var7.IIliIIliil = blockPresent < var7.iIIiIIliil
               ? IlIlllIlilIl<"IlIlllIlilIl","KHT97eri8454UgEZaoYwA3A52b+QXtok+VWg+YClshjDGa3zPJHalN3dUdaEjHA5tKHX9CF0OikPehycWSf5">()
               : IlIlllIlilIl<"IlIlllIlilIl","X9LzZQv2malsyfOidryTn6/QTGdeN1AMc/abxG7wxHzj/mmoz3e8ujano/ygeWnhgRwVPg==">();
            this.iiiiIiIlIi++;
         }

         return var7.iiIiIIliil;
      }
   }

   public IlilIiIlllilIiIl IilliliilIIi(int tick, boolean invNow, boolean serverAcked, int timeout, int blockPresent) {
      return this.lIiiIiIlilli(tick, invNow, serverAcked, timeout, blockPresent, 1);
   }

   public String IIIllIIliIIl() {
      return IlIlllIlilIl<"IlIlllIlilIl","cL+4l7Bsp5e6ZT6AKuX+aNN1yVTkN8quUnw4PBYqoucct+E8L8t4U2U8">()
         + this.lliiIiIlIi
         + IlIlllIlilIl<"IlIlllIlilIl","wi2KAyauF3m1MrccM0VbpRzt8Y3Iu6pwnfuD6HHCKYhjri8lkEiZ42pfrvkJGPep">()
         + this.iliiIiIlIi
         + IlIlllIlilIl<"IlIlllIlilIl","uSHRSLoBGDEMEwONFC2paRs9rEYPJqSB0PgAczf4eyuw8xiF2Ee3of1GrOI50IfY">()
         + this.IiiiIiIlIi
         + IlIlllIlilIl<"IlIlllIlilIl","TsTB5IwzXgvTkIRzhry5lG0o4Iv5WWNjrVDDZVue9X3lyXt6lrGiZvzAsvA6PDfV">()
         + this.liiiIiIlIi
         + IlIlllIlilIl<"IlIlllIlilIl","xm/PgS1phIw4Zs4Afx9n2Sr8EoWYiD2DL/N3vJy+1s581NS027vpBo7jTSS9tHhcy6g=">()
         + this.iiiiIiIlIi
         + IlIlllIlilIl<"IlIlllIlilIl","b7PE29E9rHRG4KNAhDvhCUFh2xQZjui3x9V4OWBGxCFJISpS6xeNmR8F2z+pDBc=">()
         + this.IIIIliIlIi;
   }
}
