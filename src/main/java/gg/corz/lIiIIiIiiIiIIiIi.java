package gg.corz;

public final class lIiIIiIiiIiIIiIi {
   public final long llIIiilIIi;
   public final int iiIIiilIIi;
   private boolean IIlIiilIIi;
   private boolean lIlIiilIIi;
   public final long liIIiilIIi;
   public final long IiIIiilIIi;
   private boolean iIlIiilIIi;
   public final Iiillilliillil ilIIiilIIi;

   public void liiiIIllIl() {
      this.lIlIiilIIi = true;
   }

   public boolean IlIlllIlilIl() {
      return this.iIlIiilIIi;
   }

   public boolean iliIiiliiiii() {
      return this.iIlIiilIIi;
   }

   public lIiIIiIiiIiIIiIi(long placedTick, Iiillilliillil tempCell, long id, long ownerCell, int purpose) {
      this.llIIiilIIi = placedTick;
      this.ilIIiilIIi = tempCell;
      this.IiIIiilIIi = id;
      this.liIIiilIIi = ownerCell;
      this.iiIIiilIIi = purpose;
   }

   public void iIlIlllllill() {
      this.iIlIiilIIi = true;
   }

   public boolean IilliliilIIi() {
      return this.IIlIiilIIi;
   }

   @Override
   public String toString() {
      return IiIlliIliiIl<"IiIlliIliiIl","Yjq4HLm5XYIWyNT5x4aklD7+qp2+tbkH9kA1AsYsGlM/7uNAmh+Yv8WtGmdnSw==">()
         + this.llIIiilIIi
         + IiIlliIliiIl<"IiIlliIliiIl","+gFSj8qau1WouJZ+NSqOyBU/uufi4BuDJxQ6+MLN+aZ9OrwgQA==">()
         + this.ilIIiilIIi
         + IiIlliIliiIl<"IiIlliIliiIl","yvhO4oygpw4cqArfsqti2f4DuNWpbnZItwLi+S0wB0Tfn7E=">()
         + this.IiIIiilIIi
         + IiIlliIliiIl<"IiIlliIliiIl","Xa58xVWG6sYEJoBF8KJ5BgOQ9Y9yyU7T9ALqzf6cY0i8zQ==">()
         + this.liIIiilIIi
         + IiIlliIliiIl<"IiIlliIliiIl","OVxmW3yr3DWHr0s3QgBGxill33n/CqsiK48upSwQeGXR0bgU">()
         + this.IIlIiilIIi
         + IiIlliIliiIl<"IiIlliIliiIl","rr9NVMEhpy2dKNnTeM1n6ltLBZFPZatWDt1Vx0+Qu1CR2zM0">()
         + this.lIlIiilIIi
         + IiIlliIliiIl<"IiIlliIliiIl","k+F21QB5zv1ntf8m2yRgdy4r44GjWt9taKk8a60evMKDIyPbLA==">()
         + this.iIlIiilIIi
         + IiIlliIliiIl<"IiIlliIliiIl","71DkJh9BParLLPUbT3eES5kLkppV4BTZSejrkTs=">();
   }

   public boolean lIiiIiIlilli() {
      return this.lIlIiilIIi;
   }

   public void IliIlllilIi() {
      this.IIlIiilIIi = true;
   }

   public boolean IIIllIIliIIl(int settleTicks, int now) {
      return this.IIlIiilIIi && this.lIlIiilIIi && !this.iIlIiilIIi && settleTicks - this.iiIIiilIIi >= now;
   }
}
